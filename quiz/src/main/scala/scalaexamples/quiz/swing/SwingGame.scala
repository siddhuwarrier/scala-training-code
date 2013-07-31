package scalaexamples.quiz.swing

import scala.swing._
import scala.swing.Swing._
import scalaexamples.quiz.Quiz
import scala.language.reflectiveCalls

class SwingGame(quiz: Quiz) extends MainFrame {

  // TODO: Implement quiz game UI and logic
  
  size = (300, 200)
  setLocationRelativeTo(this)
  title = quiz.title
  visible = true
  
}
