整体结构与工厂方法类似，区别在于：工厂方法只考虑一类(个)产品，
而抽象工厂考虑的式多等级，及不同等级的产品族(多个产品),
实现的话，只需在工厂方法的AbstractFactory加上产品族的所有接口，实现类分别实现即可