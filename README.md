# Spring Boot: Application PetClinic

## Pruebas unitarias de VisitService

Las pruebas se desarrollaron con JUnit 5 y Mockito para verificar las operaciones del servicio de visitas.

### Integrante 1: Huanco Grecia Milagros
Implementó las funciones para crear, actualizar y buscar una visita por su identificador.

En `VisitServiceTest` agregó:
- `testCreateVisit`: verifica que la visita se guarde y que el resultado tenga un identificador.
- `testUpdateVisit`: verifica que se guarden y devuelvan los datos actualizados.
- `testFindVisitById`: verifica que se encuentre una visita por su ID.

### Integrante 2: Barzola Veliz
Implementó las funciones para buscar visitas por mascota, buscar visitas por veterinario y eliminar una visita por su identificador.

En `VisitServiceTest` agregó:
- `testFindByPetId`: comprueba que se devuelvan las visitas asociadas a la mascota indicada.
- `testFindByVetId`: comprueba que se devuelvan las visitas asociadas al veterinario indicado.
- `testDeleteVisit`: verifica que se solicite eliminar la visita indicada.

### Integración y ejecución
Se integraron los cambios de ambos integrantes y se resolvieron los conflictos encontrados. La ejecución de la suite reportó 21 pruebas, sin fallos ni errores.

Para ejecutar las pruebas:
```bash
./mvnw test
```
