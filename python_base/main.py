class Libro:
    def __init__(self, titulo, autor, isbn, cantidad_disponible):
        self.titulo = titulo
        self.autor = autor
        self.isbn = isbn
        self.cantidad_disponible = cantidad_disponible

class Usuario:
    def __init__(self, nombre, usuario_id):
        self.nombre = nombre
        self.usuario_id = usuario_id
        self.libros_prestados = []

    def prestar_libro(self, libro):
        if libro.cantidad_disponible > 0:
            self.libros_prestados.append(libro)
            libro.cantidad_disponible -= 1
            print(f"El libro '{libro.titulo}' ha sido prestado a {self.nombre}.")
        else:
            print(f"Lo sentimos, el libro '{libro.titulo}' no está disponible actualmente.")
    
    def devolver_libro(self, libro):
        if libro in self.libros_prestados:
            self.libros_prestados.remove(libro)
            libro.cantidad_disponible += 1
            print(f"El libro '{libro.titulo}' ha sido devuelto por {self.nombre}.")
        else:
            print(f"No se puede devolver el libro '{libro.titulo}' porque no está prestado por {self.nombre}.")

class Biblioteca:
    def __init__(self, nombre):
        self.nombre = nombre
        self.catalogo = {}

    def agregar_libro(self, libro):
        if libro.isbn not in self.catalogo:
            self.catalogo[libro.isbn] = libro
            print(f"Se ha agregado el libro '{libro.titulo}' al catálogo de la biblioteca.")
        else:
            print(f"El libro '{libro.titulo}' ya está en el catálogo de la biblioteca.")

    def buscar_libro_por_titulo(self, titulo):
        for isbn, libro in self.catalogo.items():
            if libro.titulo.lower() == titulo.lower():
                return libro
        return None

    def mostrar_catalogo(self):
        print("Catálogo de la biblioteca:")
        for isbn, libro in self.catalogo.items():
            print(f"Título: {libro.titulo}, Autor: {libro.autor}, Disponibles: {libro.cantidad_disponible}")

# Ejemplo de uso:
# Instanciación
biblioteca = Biblioteca("Biblioteca Central")

libro1 = Libro("El señor de los anillos", "J.R.R. Tolkien", "9788445005536", 3)
libro2 = Libro("Cien años de soledad", "Gabriel García Márquez", "9788437604947", 5)

# Agregar información al objeto
biblioteca.agregar_libro(libro1)
biblioteca.agregar_libro(libro2)

# Instanciación
usuario1 = Usuario("Juan", 1)
usuario2 = Usuario("María", 2)

# Uso de métodos del objeto
biblioteca.mostrar_catalogo()

usuario1.prestar_libro(libro1)
usuario2.prestar_libro(libro1)
usuario1.devolver_libro(libro1)
usuario2.prestar_libro(libro1)

biblioteca.mostrar_catalogo()