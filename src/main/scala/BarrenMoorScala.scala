package barrrenMoor

object Main extends App {

  // Necessary Imports
  import barrenMoor.StoryText.introOne
  import barrenMoor.StoryText.introTwo
  import barrenMoor.StoryText.toolTipOne
  import barrenMoor.StoryText.toolTipTwo

  // Game State Enumeration
  object GameStates extends Enumeration {
    val starting, running, complete = Value
  }

  // Variable for current game state
  var gameState = GameStates.starting

  // Logic for game start
  println("Game starting")
  println(introOne)
  println(introTwo)
  println(toolTipOne)
  println(toolTipTwo)
  gameState = GameStates.running
  var player = new barrenMoor.Player()
  var map = new barrenMoor.Map()

  // Main Game Loop
  while (gameState == GameStates.running) {
    println("Game Running")
    gameState = GameStates.complete
  }
  // Game Shutdown code
  println("Game ending")






}