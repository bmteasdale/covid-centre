# covid-centre

## Purpose of Application:
The goal of creating this application was to gain experience using Docker.
The user interface of this application was designed using components from PrimeFaces and Bootstrap 4. The fonts, `Roboto` and `Permanent Marker`, were taken from Google Fonts and images were taken from Unsplash.

> ## Project Requirements:
> - [Apache Maven](https://maven.apache.org/download.cgi)
> - [Docker for Mac](https://docs.docker.com/docker-for-mac/install/)
> - [Docker for Windows](https://docs.docker.com/docker-for-windows/install/)

## How to Run:
To build the project and package the resulting JAR file into the target directory, run the following command in the parent directory:  
```console
$ mvn package
```  

After the target directory has been successfully created, the payara server can be started by running the following command:  
```console
$ docker-compose up
```

Now that the payara server has been successfully set up, all you need to do to view the application is go to the browser of your choice to the link "http://localhost:8080/covidCases-10-SNAPSHOT/"

To later gracefully stop the payara server, press `ctrl + c` and enter the following command in the parent directory:  
```console
$ docker-compose down
```
