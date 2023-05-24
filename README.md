# Liferay project for bintegra samopostrežni portal

## Setup guid
1. Install Liferay Intelij plugin
2. Run liferay initBundle, by right clicking on root of the project and selecting Liferay -> initBundle
3. Run configuartion will appear, to run liferay server just start that configuration

## Deploying modules
1. Run mvn clean install on module you want to deploy
2. Copy module jar file into bundles deploy folder
3. Module should redeploy, check server console for any errors