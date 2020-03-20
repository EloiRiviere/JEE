<%-- 
    Document   : index
    Created on : 31 janv. 2020, 15:54:10
    Author     : Rivière Eloi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <%
        try
        {
            Double op1=Double.parseDouble(request.getParameter("Op1"));
            Double op2=Double.parseDouble(request.getParameter("Op2"));
            Double res=0.0;
            
            if(request.getParameter("operateur").equals("+"))
            {
                res=op1+op2;
            }
            else
            {
                if(request.getParameter("operateur").equals("-"))
                {
                    res=op1-op2;
                }
                else
                {
                    if(request.getParameter("operateur").equals("/"))
                    {
                        res=op1/op2;
                    }
                    else
                    {
                        if(request.getParameter("operateur").equals("*"))
                        {
                            res=op1*op2;
                        }   
                    }
                }
            }
                
            out.println(res);        
        }
            
        catch (NumberFormatException e)
        {
            out.println("uniquement des chiffres");
        }
    %>
    </body>
</html>
