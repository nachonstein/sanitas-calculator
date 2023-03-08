# sanitas-calculator
Prueba técnica

Cómo añadir el jar del servicio de traceo al repositorio local de maven:

Desde consola (directorio en el que se encuentre el jar):

`mvn install:install-file -Dfile=tracer-1.0.0.jar -DgroupId=com.sanitas -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar`

Así las siguiente dependencia del pom funcionará sin problemas:

`		
<dependency>
<groupId>com.sanitas</groupId>
<artifactId>tracer</artifactId>
<version>1.0.0</version>
</dependency>
`

También ha habido que reimplmentar la interface proporcionada, ya que la implementación por defecto  proporcionada en el jar no implementa la interface.
