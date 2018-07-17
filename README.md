# Teste com FlighRecorder e Mission Control


Do webinar: https://www.youtube.com/watch?v=ZfIg_lyhw38  
([Webinar] PROFILE DE APLICAÇÕES JAVA COM ORACLE MISSION CONTROL E FLIGHT RECORDER)  
  
Parametros importantes:  

java -ms2G -mx3G -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -XX:+UnlockCommercialFeatures -XX:+FlightRecorder

## FlightRecorder

### Gerar dump quando a aplicação termina
-XX:FlightRecorderOptions=defaultrecording=true,disk=true,settings=profile,dumponexit=true,dumponexitpath=/tmp/dump_app.jfr

### Iniciando uma gravacao quando a aplicação inicia
-XX:StartFlightRecording=duration=60s,filename=myrecording.jfr

### Controlando a execução por linha de comando
jcmd 5368 JFR.start duration=60s filename=myrecording.jfr



## Java Mission Control

### Necessário habilitar
-Dcom.sun.management.jmxremote.port=7091  
-Dcom.sun.management.jmxremote.authenticate=false  
-Dcom.sun.management.jmxremote.ssl=false  



