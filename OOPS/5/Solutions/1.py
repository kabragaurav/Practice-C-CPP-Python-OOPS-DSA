class Product:

    def __init__(self):
        self.ProductID = 0
        self.categoryID = 0
        self.unitPrice = 0

class ElectricalProduct(Product):
    def __init__(self):
        super()
        voltageRange = 0
        wattage = 0

    def changer(self,wattage = 0, unitPrice = 0):
        self.wattage = wattage
        self.unitPrice = unitPrice

    def disp(self):
        return str(self.wattage)+" "+str(self.unitPrice)

e = ElectricalProduct()
e.changer(8,3.4)
print(e.disp())
