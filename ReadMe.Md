v0.0.4 - communication with Config repo established
* This version contains communication with Config server for getting properties from config repository
New added file

*files added
	 1)CollegeProperties.Java - reads file from config repo.
	

	 2) New bootstrsap.yml is required - because the config server is bootstraped before application context is  loaded.Hence spring application name,spring profile active ,spring cloud config uri all these properties are set in bootstrap,yml
	and are available during bootstraping and loading files from config repo.

Notes: 
	1)application name from microservice is passed on to the config server and replaces the placeholder in the git      uri. This helps in maintaining one repo per application.
	2)post /actuator/refresh end point to refresh the changes from config repo on to microservice
	3) Greenwich.M3 is the spring cloud version for Spring boot 2.1.1
	4) Expose the endpoints by setting property in application.yml