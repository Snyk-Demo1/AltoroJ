public static void function1(File destDir, InputStream inputStream) throws IOException {
       TarArchiveInputStream tin = new TarArchiveInputStream(inputStream);
       TarArchiveEntry tarEntry = null;
 
       while ((tarEntry = tin.getNextTarEntry()) != null) {
           File destEntry = new File(destDir, tarEntry.getName());
           File parent = destEntry.getParentFile();
 
           if (!parent.exists()) {
               parent.mkdirs();
           }
 
           if (tarEntry.isDirectory()) {
               destEntry.mkdirs();
           } else {
               FileOutputStream fout = new FileOutputStream(destEntry);
		  fout.close();
           }
       }
      
       tin.close();
   }

public static void function2(HttpServletRequest request, HttpServletResponse response)
       throws ServletException, IOException {
      
       try {
           String callback = request.getParameter("callback");
           response.setCharacterEncoding("UTF-8");
           response.setHeader("Content-Type", callback == null ? "application/json" : "text/javascript");
          
           PrintWriter writer = response.getWriter();
           if (callback != null) {
               writer.write(callback);
               writer.write("(");
           }          
   }

public static boolean function3(String user) throws SQLException{
       if (user == null || user.trim().length() == 0 || password.trim().length() == 0)
           return false;
      
       String password = request.getParameter("passwd");
Connection connection = getConnection();
       Statement statement = connection.createStatement();
      
       ResultSet resultSet =statement.executeQuery("SELECT COUNT(*)FROM PEOPLE WHERE USER_ID = '"+ user +"' AND PASSWORD='" + password + "'"); /* BAD - user input should always be sanitized */
      
       if (resultSet.next()){
          
               if (resultSet.getInt(1) > 0)
                   return true;
       }
       return false;
   }
