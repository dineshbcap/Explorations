<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >
	<xsl:template match="/">
		<html>
 		 <body>
 		 	<img src="Images/AspireLogo.jpeg" align="right"></img>
  			<center><h2><u>Aspire Systems Testing</u></h2>
  			<table border="1">
   			 <tr bgcolor="violet">
     			 <th align="left">TestNumber</th>
    			 <th align="left">Description</th>
    			 <th align="left">Result</th>
  			 </tr>
   			 <xsl:for-each select="AspireTesting/TestCase">
  			 <tr>
     			 <td><xsl:value-of select="TestStep" /></td>
      			 <td><xsl:value-of select="Description" /></td>
      			 <td><xsl:value-of select="Result" /></td>
   			 </tr>
	    		</xsl:for-each>
	 		</table> </center>
	
 		 </body>
 	   </html>
	</xsl:template>
</xsl:stylesheet>
