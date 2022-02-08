package com.harana.ui

import slinky.core.{ReactComponentClass, StatelessComponent}
import slinky.core.annotations.react
import slinky.web.html._
import slinky.core.ReactElementMod

import scala.scalajs.js._

@react class GraphTooltip extends StatelessComponent {

  case class Props(text: String)

  def render =
    div(props.text)
}