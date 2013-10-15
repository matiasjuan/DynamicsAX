Microsoft Dynamix AX 2009 Integration
====

Use case
----

In this example we have a database with products that we need to create in DAX. The product Master is in the database. This Mule App runs at scheduled intervals (once a day). 

*  First finds the new products (querying the database using JDBC connector and applying a filter by date and status)
*  For each product calls DAX ItemsService (create operation) to create the product
*  If the creation was successful it prints the response (a dictionary with key-values)

What you can see in this example
----

**How to call a DAX web service using Windows Authentication (NTLM)**

Authentication:
----

NTLM is a Windows protocol which involves a handshake between the http client and the server. The requirements are to pass the username, password, workstation and the host of the resource.

Since the Mule HTTP endpoint cannot send the NTLM credentials, we replaced it with a Groovy Script that takes the place of the http outbound 
and does both the authentication and the outbound dispatch. 

This portion if the application is based on Nial's example (NTLM Soap Proxy - https://github.com/nialdarbey/ntlm-soap-proxy) .


This app uses CXF client libraries and SOAP component (JAX-WS client) to generate the SOAP message. The java code was generated with wsdl2java (provided by CXF libraries).  

To call other DAX services you will need

*  the service wsdl, i.e.: http://<dax server>/MicrosoftDynamicsAXAif50/itemservice.svc?wsdl
*  cxf libraries

Create client code run from a command line 

```apache-cxf-2.7.6\bin\wsdl2java -client -p <package> -frontend jaxws21 <path to wsdl>```

Where

*  package: is the package name for the client code, i.e. _com.microsoft.dynamics.ax_
*  path to wsdl: is the url or file path to the WSDL _http://<dax server>/MicrosoftDynamicsAXAif50/itemservice.svc?wsdl_


Configuration
----

```
#endpoint to run the flow
http.port=8081
http.host=localhost
http.path=products
```

```
#database (product master)
database.url=jdbc:sqlserver://<server ip or hostname>;databaseName=<database name>
database.user=<db login name>
database.pass=<db login password>
```

```
#url to the WSDL
dax.itemservice=ItemWDSL.xml
#dax.itemservice=http://msps-win-01.mulesoft.demos.com/MicrosoftDynamicsAXAif50/itemservice.svc?wsdl
```

```
#DAX endpoint
dax.host=127.0.0.1
dax.path=/MicrosoftDynamicsAXAif50/itemservice.svc
dax.port=8088
#dax.host=msps-win-01.mulesoft.demos.com
#dax.path=/MicrosoftDynamicsAXAif50/itemservice.svc
#dax.port=80
```

```
#Authentication parameters
ntlm.user=Administrator
ntlm.password=mule
ntlm.workstation=localhost
ntlm.domain=mulesoft
```

```
#soap action (you can see it in the WSDL
soap.action=http://tempuri.org/IItemService/CreateProduct
#soap.action=http://schemas.microsoft.com/dynamics/2008/01/services/ItemService/create
```




DAX Technical details
====
AIF provides 3 ways to interoperate with DAX: 

*  Services - Enable you to expose business logic written in X++ as a service to be consumed by other applications. Within Microsoft Dynamics AX, you can create, customize, and publish services.
*  Document Services - A specific implementation of services in which the Microsoft Dynamics AX business logic is exposed through document services.
*  Consume Web Services - In Microsoft Dynamics AX, you can consume external Web services from your X++ code.

DAX exposes a series of webservices called AIF Document Services (Application Integration Framework) where each service exposes 6 operations: create, delete, find, findKeys, read, update. (see About Service Classes).

Authentication
----
Since DAX runs in IIS, the authentication is managed by IIS. In this case DAX needs Windows Authentication.

Links and resources
----

*  Dynamics AX 2009: AIF overview http://msdn.microsoft.com/en-us/library/bb496535(v=ax.50).aspx
*  AIF Document Services: http://msdn.microsoft.com/en-US/library/bb496530(v=ax.50).aspx
*  AIF Document Service Classes: http://msdn.microsoft.com/en-US/library/cc582145(v=ax.50).aspx




