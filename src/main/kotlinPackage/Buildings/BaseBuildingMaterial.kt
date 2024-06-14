package kotlinPackage.Buildings

open class BaseBuildingMaterial() {
    open val numberNeeded = 1

    fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
        if (building.actualMaterialsNeeded < 500) println("Small building")
        else println("large building")
    }

}