# Base image
FROM payara/server-full

# $DEPLOY_DIR is where payara looks for applications
COPY ./target/covidCases-1.0-SNAPSHOT.war $DEPLOY_DIR
