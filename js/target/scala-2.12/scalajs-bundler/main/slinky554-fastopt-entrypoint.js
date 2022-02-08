module.exports = {
  "require": (function(x0) {
    return {
      "react": require("react"),
      "react-dom": require("react-dom"),
      "@nivo/waffle": require("@nivo/waffle")
    }[x0]
  })
}