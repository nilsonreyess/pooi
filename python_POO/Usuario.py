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
