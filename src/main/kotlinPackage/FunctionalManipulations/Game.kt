package kotlinPackage.FunctionalManipulations


class Game {

    var path_var: MutableList<Direction> = mutableListOf(Direction.START) ;

    fun GameOver() : Boolean{
        path_var.add(Direction.NORTH)
        path_var.add(Direction.SOUTH)
        path_var.add(Direction.EAST)
        path_var.add(Direction.WEST)
        path_var.add(Direction.END)
        println("Game Over")
        println(path_var)
        path_var.clear();
        return false;
    }

    fun move(where: Direction) {
        when(where){
            Direction.NORTH -> println("Move North")
            Direction.EAST -> println("Move East")
            Direction.WEST -> println("Move West")
            Direction.SOUTH -> println("Move South")
            else -> {
                println("You are not moving")
            }
        }
    }
    fun makeMove(dir : String?){
        if (dir.equals("n")){ move(Direction.NORTH)}
        else if (dir.equals("s")){ move(Direction.SOUTH)}
        else if (dir.equals("e")){ move(Direction.EAST)}
        else if (dir.equals("w")){ move(Direction.WEST)}
        else {move(Direction.END)}
    }

}