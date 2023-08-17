package SQL;

import LOGIC.Duenio;
import LOGIC.Mascota;
import LOGIC.Veterinario;
import LOGIC.HistorialMedicos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Conexion
{
    private final String url;
    private final String username;
    private final String password;
    
    public Conexion()
    {
        url = "jdbc:mysql://localhost:3306/veterinaria";
        username = "root";
        password = "";
    }
    public void conect()
    {
        try
        {
            Connection conection = DriverManager.getConnection(url,username,password);
            conection.close();
        }
        catch(SQLException ex)
        {
          System.out.println(ex);
        }
    }
    
    public List<Veterinario> traerVeterinario() 
    {
    List<Veterinario> vets = new ArrayList<>();

    try {
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT * FROM veterinario";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

       while (resultSet.next()) 
       {
        int id = resultSet.getInt("id");
        String nombre = resultSet.getString("nombre");
        String apellido = resultSet.getString("apellido");
        int edad = resultSet.getInt("edad");
        String sexo = resultSet.getString("sexo");
        String telefono = resultSet.getString("telefono");
        String especialidad = resultSet.getString("especialidad");
        Veterinario vet = new Veterinario(id, nombre, apellido, edad, "", "",sexo,telefono,especialidad);
        vet.setId(id);
        
        
        vets.add(vet);
    }
        resultSet.close();
        statement.close();
        connection.close();
    } 
    catch (SQLException ex) 
    {
        System.out.println(ex);
    }
    return vets;
}

    public List<Mascota> traerMascota()
    {
    List<Mascota> mascotas = new ArrayList<>();

    try {
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT id_mascota,nombre,sexo,especie,edad,color,peso,raza,id_duenio FROM mascotas";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

       while (resultSet.next()) 
       {
        int id = resultSet.getInt("id_mascota");
        String nombre = resultSet.getString("nombre");
        String sexo = resultSet.getString("sexo");
        String especie = resultSet.getString("especie");
        int edad = resultSet.getInt("edad");
        String  color = resultSet.getString("color");
        double peso = resultSet.getDouble("peso");
        String raza = resultSet.getString("raza");
        int id_duenio = resultSet.getInt("id_duenio");
        
        Mascota masco = new Mascota(id,nombre,sexo,especie,edad, color, raza, "",peso,id_duenio);
        masco.setId_mascota(id);
        masco.setId_duenio(id_duenio);
        
        mascotas.add(masco);
        }


        resultSet.close();
        statement.close();
        connection.close();
    } 
    catch (SQLException ex) 
    {
        System.out.println(ex);
    }

    return mascotas;
   }
   public void insertarQuery(String query)
    {
        try
        {
            Connection conection = DriverManager.getConnection(url,username,password);
            Statement statment = conection.createStatement();
            statment.executeUpdate(query);            
            statment.close();
            conection.close();
        }
        catch(SQLException ex)
        {
          System.out.println(ex);
        }
        
    }
    public void crearTablas()
    {  
            String crearTablaVeterinario = "CREATE TABLE IF NOT EXISTS veterinario (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "nombre TEXT NOT NULL," +
                    "apellido TEXT NOT NULL," +
                    "usuario TEXT NOT NULL,"+
                    "password TEXT NOT NULL,"+
                    "edad INT,"+
                    "sexo VARCHAR(1) NOT NULL,"+
                    "telefono TEXT NOT NULL,"+
                    "especialidad TEXT NOT NULL"+
                    ")";
            String crearTablaDuenio = "CREATE TABLE IF NOT EXISTS duenios("+
                    "id_duenio INT AUTO_INCREMENT PRIMARY KEY,"+
                    "nombre TEXT NOT NULL,"+
                    "apellido TEXT NOT NULL,"+
                    "sexo TEXT NOT NULL," +
                    "direccion TEXT NOT NULL,"
                    +"edad INT NOT NULL,"+
                    "telefono TEXT NOT NULL)";
            
            String crearTablaMascotas  = "CREATE TABLE IF NOT EXISTS mascotas ("+
                    "id_mascota INT AUTO_INCREMENT PRIMARY KEY,"+
                    "nombre TEXT NOT NULL,"+
                    "sexo TEXT NOT NULL,"+
                    "especie TEXT NOT NULL,"+
                    "edad INT,"+
                    "color TEXT NOT NULL,"+
                    "observaciones TEXT NOT NULL,"+
                    "peso DECIMAL,"+
                    "raza TEXT NOT NULL,"+
                    "id_duenio INT,"+
                    "FOREIGN KEY(id_duenio) REFERENCES duenios(id_duenio))";
            
            String crearTablaHistorialMedico = "CREATE TABLE IF NOT EXISTS HistorialMedico("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "MascotaID INT,"
                    + "VeterinarioID INT,"
                    + "FechaVisita DATE,"
                    + "MotivoVisita TEXT NOT NULL,"
                    + "Descripcion TEXT NOT NULL,"
                    + "FechaVacuna DATE,"
                    + "NombreVacuna TEXT,"
                    + "Desparasitacion DATE,"
                    + "Medicamentos TEXT,"
                    + " FOREIGN KEY (MascotaID) REFERENCES mascotas(id_mascota),"
                    + "  FOREIGN KEY (VeterinarioID) REFERENCES veterinario(id))";

            
            insertarQuery(crearTablaVeterinario); 
            insertarQuery(crearTablaDuenio);
            insertarQuery(crearTablaMascotas);
            insertarQuery(crearTablaHistorialMedico);
           
    }
    
    public void insertVeterinario(Veterinario vet)
    {
         String inVet = "INSERT INTO veterinario(nombre, apellido, usuario, password, edad, sexo, telefono, especialidad) " +
        "VALUES('" + vet.getNombre() + "', '" + vet.getApellido() + "', '" + vet.getUser() + "', '" +
        vet.getPassword() + "', '" + vet.getEdad() +  "', '" + vet.getSexo()+  "', '" + vet.getTelefono() 
             +  "', '" + vet.getEspecialidad() +"');";
        insertarQuery(inVet);
    }
    
    public void insertMascotas(Mascota masco)
    {
    String insertQuery = "INSERT INTO mascotas(nombre, sexo, especie, edad, color, observaciones, peso, raza, id_duenio) " +
        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) 
    {
        preparedStatement.setString(1, masco.getNombre());
        preparedStatement.setString(2, masco.getSexo());
        preparedStatement.setString(3, masco.getEspecie());
        preparedStatement.setInt(4, masco.getEdad());
        preparedStatement.setString(5, masco.getColor());
        preparedStatement.setString(6, masco.getObservaciones());
        preparedStatement.setDouble(7, masco.getPeso());
        preparedStatement.setString(8, masco.getRaza());
        preparedStatement.setInt(9, masco.getId_duenio());

        preparedStatement.executeUpdate();
        preparedStatement.close();
        connection.close();
        
    } 
    catch (SQLException e)
    {
        System.out.println(e);
    }
    
    }
    
    public void insertarDuenio(Duenio duenio)
    {
        String insterDuenio = "INSERT INTO duenios(nombre, apellido, sexo, direccion, telefono, edad)"
                + "VALUES(?,?,?,?,?,?)";
        
        try(Connection conection = DriverManager.getConnection(url,username,password);
                PreparedStatement statment = conection.prepareStatement(insterDuenio))
        {
            statment.setString(1, duenio.getNombre());
            statment.setString(2,duenio.getApellido());
            statment.setString(3,duenio.getSexo());
            statment.setString(4, duenio.getDireccion());
            statment.setString(5,duenio.getTelefono());
            statment.setInt(6, duenio.getEdad());
            statment.executeUpdate();
            statment.close();
            conection.close();
            
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
    }
    
   public int usuarioExiste(String usuario) 
   {
    int count = 0;
    try {
        Connection conn = DriverManager.getConnection(url, username, password);
        
        String consulta = "SELECT COUNT(*) FROM veterinario WHERE usuario = ?";
        PreparedStatement ps = conn.prepareStatement(consulta);
        ps.setString(1, usuario);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) 
        {
            count = rs.getInt(1);
        }
        
        rs.close();
        ps.close();
        conn.close();
    }
    catch (SQLException e) 
    {
        e.printStackTrace();
    }
    return count;
    }
   
    public boolean login(Veterinario vet) 
   {
  
    try {
        Connection conn = DriverManager.getConnection(url, username, password);
        
        String consulta = "SELECT id, nombre, apellido, usuario, password FROM veterinario WHERE usuario = ?";
        PreparedStatement ps = conn.prepareStatement(consulta);
        ps.setString(1, vet.getUser());
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) 
        {
            if(vet.getPassword().equals(rs.getString(5)))
            {
                vet.setId(rs.getInt(1));
                vet.setNombre(rs.getString(2));
                vet.setApellido(rs.getString(3));
                return true;                 
            }
            else
            {
                return false;
            } 
            
        }
        return false;
        
    } 
    catch (SQLException e) 
    {
        e.printStackTrace();
    }
    return false;
    }

    public List<Duenio> obtenerListaIDDuenios() 
    {
         List<Duenio> idDuenios = new ArrayList<>();
    try {
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT id_duenio FROM duenios";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) 
        {
            int id = resultSet.getInt("id_duenio");
            Duenio duenio = new Duenio(id, "", "", "", "", "",0);
            idDuenios.add(duenio);
        }
        
        resultSet.close();
        statement.close();
        connection.close();
    } 
    catch (SQLException ex) 
    {
        System.out.println(ex);
    }
        
    return idDuenios;
    }
    public List<Mascota> obtenerListaIDMascotas() 
    {
         List<Mascota> idMascotas = new ArrayList<>();
    try {
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT id_mascota FROM mascotas";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) 
        {
            int id = resultSet.getInt("id_mascota");
            Mascota masco = new Mascota(id, "", "", "", 0, "","","",0,0);
            idMascotas.add(masco);
        }
        
        resultSet.close();
        statement.close();
        connection.close();
    } 
    catch (SQLException ex) 
    {
        System.out.println(ex);
    }
        
    return idMascotas;
    }
    public List<Veterinario> obtenerListaIDMVeterinarios() 
    {
         List<Veterinario> idVets = new ArrayList<>();
    try {
        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "SELECT id FROM veterinario";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) 
        {
            int id = resultSet.getInt("id");
           Veterinario vet = new Veterinario(id,"","",0,"","","","","");
            idVets.add(vet);
        }
        
        resultSet.close();
        statement.close();
        connection.close();
    } 
    catch (SQLException ex) 
    {
        System.out.println(ex);
    }
        
    return idVets;
    }
     public List<java.sql.Date> obtenerFechasDeVisitasPorID(int id) 
     {
        List<java.sql.Date> listFechas = new ArrayList<>();
        try {
            Connection conect = DriverManager.getConnection(url, username, password);
            String selectFechas = "SELECT FechaVisita FROM HistorialMedico WHERE MascotaID = ?";
            PreparedStatement statement = conect.prepareStatement(selectFechas);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();

            while (rs.next())
            {
                Date fechaV = rs.getDate("FechaVisita");
                listFechas.add(fechaV);
            }

            rs.close();
            statement.close();
            conect.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }
    return listFechas;
}
    public List<Duenio> traerDuenio() 
    {
        List<Duenio> Duenios = new ArrayList<>();
        try 
        {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM duenios";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

       while (resultSet.next()) 
       {
            int id = resultSet.getInt("id_duenio");
            String nombre = resultSet.getString("nombre");
            String apellido = resultSet.getString("apellido");
            String sexo = resultSet.getString("sexo");
            String direccion = resultSet.getString("direccion");
            String telefono = resultSet.getString("telefono");
            int edad = resultSet.getInt("edad");
            Duenio duenio = new Duenio(id,nombre,apellido,sexo,direccion,telefono, edad);

            Duenios.add(duenio);
       }
        resultSet.close();
        statement.close();
        connection.close();
    } catch (SQLException ex) 
    {
        System.out.println(ex);
    }
        
        return Duenios;
    }
    
    public List<HistorialMedicos> traerHistorialMedico() 
    {
        List<HistorialMedicos> listH = new ArrayList<>();
        try
        {
            Connection conect = DriverManager.getConnection(url,username,password);
            String query = "SELECT * FROM HistorialMedico";
            Statement statement = conect.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next())
            {
                int id = result.getInt("id");
                int mascoID = result.getInt("MascotaID");
                int VetID = result.getInt("VeterinarioID");
                Date fechaVisita = result.getDate("FechaVisita");
                String motivoVisita = result.getString("MotivoVisita");
                String descripcion = result.getString("Descripcion");
                Date fechaVacu = result.getDate("FechaVacuna");
                String nomVacuna = result.getString("NombreVacuna");
                Date desparasitacion = result.getDate("Desparasitacion");
                String medicamentos = result.getString("Medicamentos");
                
                HistorialMedicos HM = new HistorialMedicos(id,mascoID,VetID,fechaVisita,motivoVisita,descripcion,fechaVacu,
                nomVacuna,desparasitacion,medicamentos);
                listH.add(HM);
            }
            
            result.close();
            statement.close();
            conect.close();
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        return listH;
    }

    public Veterinario obtenerVeterinarioPorId(int id)
    {
        try 
        {
            Connection connection = DriverManager.getConnection(url, username, password);
            String query = "SELECT * FROM veterinario WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) 
        {
            String nombre = resultSet.getString("nombre");
            String apellido = resultSet.getString("apellido");
            int edad = resultSet.getInt("edad");
            String sexo = resultSet.getString("sexo");
            String telefono = resultSet.getString("telefono");
            String especialidad = resultSet.getString("especialidad");

            Veterinario vet = new Veterinario(id, nombre, apellido, edad,"","",telefono, sexo, especialidad);
            resultSet.close();
            statement.close();
            connection.close();
            return vet;
        }
        
        resultSet.close();
        statement.close();
        connection.close();
    } 
     catch (SQLException ex) 
    {
        System.out.println(ex);
    }

    return null;
    }
     public Duenio obtenerDuenioPorID(int id_duenio)
     {
         try(Connection conect = DriverManager.getConnection(url,username,password))
         {
             String selectDuenioID = "SELECT * FROM duenios WHERE id_duenio = ?";
             PreparedStatement statment = conect.prepareStatement(selectDuenioID);
             statment.setInt(1,id_duenio);
             ResultSet result = statment.executeQuery();
             if(result.next())
             {
                 String nombre = result.getString("nombre");
                 String apellido = result.getString("apellido");
                 String sexo = result.getString("sexo");
                 String direccion = result.getString("direccion");
                 String telefono = result.getString("telefono");
                 int edad = result.getInt("edad");
                 Duenio duenio = new Duenio(id_duenio,nombre,apellido,sexo,direccion,telefono, edad);
                 statment.close();
                 result.close();
                 conect.close();
                 return duenio;
             }
                statment.close();
                 result.close();
                 conect.close();
         }
         catch(SQLException ex)
         {
             System.out.println(ex);
         }
         return null;
     }
     
     public Mascota obtenerMascotaPorID(int id) 
    {    
    try {
        Connection conect = DriverManager.getConnection(url, username, password);
        String selectMascoID = "SELECT * FROM mascotas WHERE id_mascota = ?";
        PreparedStatement statment = conect.prepareStatement(selectMascoID);
       statment.setInt(1,id);
        ResultSet resultSet = statment.executeQuery();

       while (resultSet.next()) 
       {
        String nombre = resultSet.getString("nombre");
        String sexo = resultSet.getString("sexo");
        String especie = resultSet.getString("especie");
        int edad = resultSet.getInt("edad");
        String  color = resultSet.getString("color");
        double peso = resultSet.getDouble("peso");
        String raza = resultSet.getString("raza");
        int id_duenio = resultSet.getInt("id_duenio");
        String observaciones = resultSet.getString("observaciones");
        
        Mascota masco = new Mascota(id,nombre,sexo,especie,edad, color, raza, observaciones,peso,id_duenio);
        return masco;
        }
        resultSet.close();
        statment.close();
        conect.close();
    } 
    catch (SQLException ex) 
    {
        System.out.println(ex);
    }
       return null;
    }
    
    public boolean actualizarVeterinario(Veterinario vet) 
    {
    try (Connection connection = DriverManager.getConnection(url, username, password)) 
    {
        String query = "UPDATE veterinario SET nombre = ?, apellido = ?, edad = ?, sexo = ?, telefono = ?, especialidad = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, vet.getNombre());
        statement.setString(2, vet.getApellido());
        statement.setInt(3, vet.getEdad());
        statement.setString(4, vet.getSexo());
        statement.setString(5, vet.getTelefono());
        statement.setString(6, vet.getEspecialidad());
        statement.setInt(7, vet.getId());

        int rowsAffected = statement.executeUpdate();
        return rowsAffected > 0;
    }
    catch (SQLException ex) 
    {
        ex.printStackTrace();
    }

    return false;
}
    
    public boolean actualizarDuenio(Duenio duenio)
    {
        try(Connection conection = DriverManager.getConnection(url,username,password))
        {
            String UptdateDuenio = "UPDATE duenios SET nombre = ?, apellido = ?, sexo = ?, direccion = ?, telefono = ?, edad = ? WHERE id_duenio = ?";
            PreparedStatement statment = conection.prepareStatement(UptdateDuenio);
            statment.setString(1, duenio.getNombre());
            statment.setString(2,duenio.getApellido());
            statment.setString(3, duenio.getSexo());
            statment.setString(4,duenio.getDireccion());
            statment.setString(5,duenio.getTelefono());
            statment.setInt(6,duenio.getEdad());
            statment.setInt(7,duenio.getId_duenio());
            int filaAfectada = statment.executeUpdate();
            return filaAfectada > 0;
        }
        catch(SQLException ex)
        {
           System.out.println(ex);
        }
        return false;
    }
    public boolean actualizarMascota(Mascota masco)
    {
        String updateQuery = "UPDATE mascotas SET nombre = ?, sexo = ?, especie = ?, edad = ?, color = ?, observaciones = ?, peso = ?, raza = ?, id_duenio = ? WHERE id_mascota = ?";

        try (Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) 
        {

            preparedStatement.setString(1, masco.getNombre());
            preparedStatement.setString(2, masco.getSexo());
            preparedStatement.setString(3, masco.getEspecie());
            preparedStatement.setInt(4, masco.getEdad());
            preparedStatement.setString(5, masco.getColor());
            preparedStatement.setString(6, masco.getObservaciones());
            preparedStatement.setDouble(7, masco.getPeso());
            preparedStatement.setString(8, masco.getRaza());
            preparedStatement.setInt(9,masco.getId_duenio());
            preparedStatement.setInt(10, masco.getId_mascota());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.out.println(e);
        }
        return false;
}

    public String obtenerNombreDuenioPorID(int idSeleccionado) 
    {
        
        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            String consulta = "SELECT nombre FROM duenios WHERE id_duenio = ?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, idSeleccionado);
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next())
            {
                String nombreDuenio = resultSet.getString("nombre");
                resultSet.close();
                statement.close();
                connection.close();
                return nombreDuenio;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        return null;
    }
    
    public String obtenerNombreMascoPorID(int idSeleccionado) 
    {
        
        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            String consulta = "SELECT nombre FROM mascotas WHERE id_mascota = ?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, idSeleccionado);
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next())
            {
                String nombreMascota = resultSet.getString("nombre");
                resultSet.close();
                statement.close();
                connection.close();
                return nombreMascota;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        return null;
    }
    public String obtenerNombreVetPorID(int idSeleccionado) 
    {
        
        try
        {
            Connection connection = DriverManager.getConnection(url,username,password);
            String consulta = "SELECT nombre FROM veterinario WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(consulta);
            statement.setInt(1, idSeleccionado);
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next())
            {
                String nombreVet = resultSet.getString("nombre");
                resultSet.close();
                statement.close();
                connection.close();
                return nombreVet;
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        return null;
    }
    
    public void insertHistorialMedico(HistorialMedicos HM)
    {
        String insertHM = "INSERT INTO HistorialMedico (MascotaID,VeterinarioID,FechaVisita,MotivoVisita,Descripcion,"
                + "FechaVacuna,NombreVacuna,Desparasitacion,Medicamentos) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        
        try
        {
            Connection conect = DriverManager.getConnection(url,username,password);
            PreparedStatement statement = conect.prepareStatement(insertHM);
            statement.setInt(1, HM.getMascotaID());
            statement.setInt(2, HM.getVeterinarioID());
            statement.setDate(3, HM.getFechaVisita());
            statement.setString(4, HM.getMotivoVisita());
            statement.setString(5, HM.getDescripcion());
            statement.setDate(6, HM.getFechaVacuna());
            statement.setString(7,HM.getNombreVacuna());
            statement.setDate(8, HM.getDesparasitacion());
            statement.setString(9,HM.getMedicamentos());
            statement.executeUpdate();
            statement.close();
            conect.close();
        }
        catch(SQLException ex)
        {
           System.out.println(ex);
        }
    }
    
    public HistorialMedicos ultimasVacunasDespa(int idSeleccionado)
    {
        HistorialMedicos HM = new HistorialMedicos();
       String queryVacuna = "SELECT FechaVacuna, NombreVacuna FROM HistorialMedico WHERE MascotaID = ? AND FechaVacuna IS NOT NULL ORDER BY FechaVacuna DESC LIMIT 1";
       String queryDesparasitacion = "SELECT Desparasitacion FROM HistorialMedico WHERE MascotaID = ? AND Desparasitacion IS NOT NULL ORDER BY Desparasitacion DESC LIMIT 1";

       try 
       {
           Connection conect = DriverManager.getConnection(url,username,password);

           PreparedStatement statementVacuna = conect.prepareStatement(queryVacuna);
           statementVacuna.setInt(1, idSeleccionado);
           ResultSet resultVacuna = statementVacuna.executeQuery();

           while(resultVacuna.next()) 
           {
               Date fechaVacuna = resultVacuna.getDate("FechaVacuna");
               String nombreVacuna = resultVacuna.getString("NombreVacuna");

               HM.setFechaVacuna(fechaVacuna);
               HM.setNombreVacuna(nombreVacuna);
           }

           PreparedStatement statementDesparasitacion = conect.prepareStatement(queryDesparasitacion);
           statementDesparasitacion.setInt(1, idSeleccionado);
           ResultSet resultDesparasitacion = statementDesparasitacion.executeQuery();

           if(resultDesparasitacion.next()) 
           {
               Date desparasitacion = resultDesparasitacion.getDate("Desparasitacion");
               HM.setDesparasitacion(desparasitacion);
           }

           resultVacuna.close();
           statementVacuna.close();
           resultDesparasitacion.close();
           statementDesparasitacion.close();
           conect.close();
           return HM;
       } catch(SQLException ex) 
       {
           System.out.println(ex);
       }

       return null;
    }

   
   public HistorialMedicos obtenerDatosSegunFecha(java.sql.Date fechaSelect) 
   {
        HistorialMedicos hm = new HistorialMedicos();
        String query = "SELECT MotivoVisita, Descripcion, Medicamentos, VeterinarioID FROM HistorialMedico WHERE FechaVisita = ?";
        try {
                Connection conect = DriverManager.getConnection(url, username, password);
                PreparedStatement statement = conect.prepareStatement(query);
                statement.setDate(1, fechaSelect);
                ResultSet rs = statement.executeQuery();
                
                if (rs.next()) 
                {
                    String motVisita = rs.getString("MotivoVisita");
                    String descrip = rs.getString("Descripcion");
                    String medicamentos = rs.getString("Medicamentos");
                    int vetId = rs.getInt("VeterinarioID");
                    hm.setMotivoVisita(motVisita);
                    hm.setDescripcion(descrip);
                    hm.setMedicamentos(medicamentos);
                    hm.setVeterinarioID(vetId);
                }
                
                statement.close();
                conect.close();
                rs.close();
        } catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        return hm;
    }
    

    
    
}

