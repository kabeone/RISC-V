
import chisel3._

class PIN_HIGH extends Module {
  val io = IO(new Bundle {
    val pin = Output(Bool())
  })

  io.pin := true.B
}

object PIN_HIGH extends App {
  chisel3.Driver.execute(args, () => new PIN_HIGH)
}
