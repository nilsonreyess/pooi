import Libro as L
import Usuario as U
import Biblioteca as B

# Ejemplo de uso:
# Instanciación
biblioteca = B.Biblioteca("Biblioteca Central")

libro1 = L.Libro("El señor de los anillos", "J.R.R. Tolkien", "9788445005536", 3)
libro2 = L.Libro("Cien años de soledad", "Gabriel García Márquez", "9788437604947", 5)

# Agregar información al objeto
biblioteca.agregar_libro(libro1)
biblioteca.agregar_libro(libro2)

# Instanciación
usuario1 = U.Usuario("Juan", 1)
usuario2 = U.Usuario("María", 2)

# Uso de métodos del objeto
biblioteca.mostrar_catalogo()

usuario1.prestar_libro(libro1)
usuario2.prestar_libro(libro1)
usuario1.devolver_libro(libro1)
usuario2.prestar_libro(libro1)

biblioteca.mostrar_catalogo()