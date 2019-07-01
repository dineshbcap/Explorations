<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<body>
				<table width="100%">
					<tr>
						<td valign="top">
							<div style="margin-left:0%;">
								<img src="AspireLogo.jpeg" align="left" width="50%" height="30%"></img>
							</div>
						</td>
						<td valign="top">
							<div style="margin-left:30%;">
								<h2>
									<u>Staples Automation Results</u>
								</h2>
							</div>
						</td>
						<td>
							<div style="margin-left:60%;">
								<img src="StaplesLogo.jpeg" width="50%" height="30%"></img>
							</div>
						</td>
					</tr>
				</table>

				<div style="margin-left:35%;">

					<table border="1">
						<tr bgcolor="DarkViolet">
							<th align="left">Android Version</th>
							<th align="left">OS Version</th>
						</tr>
						<xsl:for-each select="Staple/VersionDetails">
							<tr>
								<td>
									<xsl:value-of select="android_version" />
								</td>
								<td>
									<xsl:value-of select="os_version" />
								</td>
							</tr>
						</xsl:for-each>
					</table>
				</div>

				<br></br>
				<table border="1" width="80%">
					<tr bgcolor="DarkViolet ">
						<th align="left">Case Id</th>
						<th align="center">Description</th>
						<th align="left">Result</th>
					</tr>

					<xsl:for-each select="Staple/Result">
						<tr>
							<td>
								<xsl:value-of select="case_id" />
							</td>
							<td>
								<xsl:value-of select="description" />
							</td>
							<td>
								<div title="Click To View Testcase Details">
									<a href="{concat('#', case_id)}">
										<xsl:value-of select="result" />
									</a>


								</div>
							</td>
						</tr>
					</xsl:for-each>
				</table>






				<br></br>
				<br></br>

				<h3><u>Test Summary :</u></h3>
				<table border="1" width="80%">
					<tr bgcolor="DarkViolet">
						<th align="left">AUT</th>
						<th align="left">Total Test Cases</th>
						<th align="left">Test Cases Pass</th>
						<th align="left">Test Cases Fail</th>
					</tr>
					<tr>
						<td>
							Staples Application
								</td>
						<td>
							<xsl:value-of select="count(Staple/Result/result)" />
						</td>
						<td>
							<xsl:value-of
								select="count(Staple/Result[normalize-space(result)='pass'])" />
						</td>
						<td>
							<xsl:value-of
								select="count(Staple/Result[normalize-space(result)='fail'])" />
						</td>
					</tr>
				</table>


				<br></br>
				<br></br>

				<xsl:for-each select="Staple/Steps">
					<a name="{@id}"></a>
					<b>
						<u>
							<xsl:value-of select="@id" />
							:
						</u>
					</b>

					<xsl:variable name="count"
						select="count(Step[normalize-space(result)='fail'])"></xsl:variable>


					<table border="1" width="80%">

						<xsl:choose>
							<xsl:when test="$count &gt; 0">
								<tr bgcolor="red">
									<th align="left">Step Id</th>
									<th align="center">Description</th>
									<th align="left">Result</th>
								</tr>
							</xsl:when>


							<xsl:otherwise>
								<tr bgcolor="green">
									<th align="left">Step Id</th>
									<th align="center">Description</th>
									<th align="left">Result</th>
								</tr>
							</xsl:otherwise>
						</xsl:choose>
						<xsl:for-each select="Step">

							<tr>
								<td>
									<xsl:value-of select="step_id" />
								</td>
								<td>
									<xsl:value-of select="description" />
								</td>
								<td>
									<xsl:value-of select="result" />
								</td>
							</tr>

						</xsl:for-each>
					</table>
					<br></br>
					<div style="margin-left:35%;">
						<a href="#top">
							Back To Top
						</a>
					</div>
					<br></br>
					<br></br>
					<br></br>
				</xsl:for-each>

				<br></br>
				<div style="margin-left:40%;">
					<button name="print" onclick="window.print()" style="width:15%">Print</button>
				</div>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>