# BINTEGRA - online service

## Setup
You have to have gradel and lifray blade cli installed.  
1. Run `gradle initBundle` to download the liferay bundle and it creates a run configuration.
2. Run generated run congifuration to start your liferay server. 


## Headless API
To add or modify any endpoints in rest builder module  
1. Modify rest-openapi.yaml file.
2. Run `gradle buildREST` in module to generate the endpoints.
3. To see any changes run `gradle deploy` in module to deploy the changes to liferay server.