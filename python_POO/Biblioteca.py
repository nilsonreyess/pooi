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
