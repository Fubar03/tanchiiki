package ru.aa.Neupokoev.battleTanks.enums

import ru.aa.Neupokoev.battleTanks.R

const val CELLS_SIMPLE_ELEMENT = 1
const val CELLS_EAGLE_WIDTH = 4
const val CELLS_EAGLE_HEIGHT = 3
const val CELLS_TANKS_SIZE = 2

enum class Material(val tankCanGoThrough: Boolean,
val bulletCanGoThrought: Boolean,
val simpleBulletCanDestroy: Boolean,
                    val elementsAmoutOnScreen: Int,
                    val width: Int,
                    val height: Int,
                    val image: Int
)


{
    EMPTY(true, true, true, 0, 0, 0, 0),
    BRICK(false,false, true, 0, CELLS_SIMPLE_ELEMENT, CELLS_SIMPLE_ELEMENT, R.drawable.brick),
    CONCRETE(false,false, false, 0, CELLS_SIMPLE_ELEMENT, CELLS_SIMPLE_ELEMENT, R.drawable.concrete),
    GRASS(true,true, false, 0, CELLS_SIMPLE_ELEMENT, CELLS_SIMPLE_ELEMENT, R.drawable.grass),
    EAGLE(false, false, true, 1, CELLS_EAGLE_WIDTH, CELLS_EAGLE_HEIGHT, R.drawable.eagle),

    ENEMY_TANK_RESPAWN(false,false,true,3, CELLS_TANKS_SIZE, CELLS_TANKS_SIZE, R.drawable.enemy_tank),
    PLAYER_TANK_RESPAWN(false,false,true,1, CELLS_TANKS_SIZE, CELLS_TANKS_SIZE, R.drawable.tank)
}
