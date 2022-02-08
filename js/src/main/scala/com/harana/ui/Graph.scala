package com.harana.ui

import com.harana.ui.external.nivo.{TooltipData, Waffle, WaffleEntry}
import slinky.core.{ReactComponentClass, StatelessComponent}
import slinky.core.annotations.react
import slinky.web.html._
import slinky.core.ReactElementMod

import scala.scalajs.js
import scala.scalajs.js._
import scala.scalajs.js.annotation.JSExportTopLevel

@react class Graph extends StatelessComponent {

  case class Props(values: List[(Int, String)])

  def render =
    Waffle(
      total = props.values.size,
      data = props.values.map { v => new WaffleEntry {
        override val id = "id"
        override val value = v._1
        override val label = v._2
      }},
      columns = props.values.size,
      rows = 1,
      height = 20,
      fillDirection = "left",
      width = 20 * props.values.size,
      tooltip = (obj: js.Object) => GraphTooltip(obj.toString)
  )
}