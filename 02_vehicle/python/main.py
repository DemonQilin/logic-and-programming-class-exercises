class Vehicle:
    def __init__(self, brand, plate, color, model):
        self.brand = brand
        self.plate = plate
        self.color = color
        self.model = model

    def details(self):
        return f"Brand: {self.brand}\nPlate: {self.plate}\nColor: {self.color}\nModel: {self.model}"


def main():
    taxi = Vehicle("Nissan", "RTXB101", "Amarillo", 2022)
    moto = Vehicle("Yamaha", "ABC42E", "Negra", 2021)
    bus = Vehicle("Chevrolet", "RFG123", "De todos los colores", 2005)

    print("\nDetalles taxi")
    print(taxi.details())

    print("\nDetalles moto")
    print(moto.details())

    print("\nDetalles bus")
    print(bus.details())


if __name__ == '__main__':
    main()
