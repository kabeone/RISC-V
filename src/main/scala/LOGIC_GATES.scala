import chisel3._

class LOGIC_GATES extends Module {
  val io = IO(new Bundle {
    val input = Input(Vec(2, Bool()))
    val output = Output(Vec(7, Bool()))
  })

  io.output(0) := ~io.input(0)
  io.output(1) := io.input(0) & io.input(1)
  io.output(2) := io.input(0) | io.input(1)
  io.output(3) := io.input(0) ^ io.input(1)
  io.output(4) := ~(io.input(0) & io.input(1))
  io.output(5) := ~(io.input(0) | io.input(1))
  io.output(6) := ~(io.input(0) ^ io.input(1))
}

object LOGIC_GATES extends App {
  chisel3.Driver.execute(args, () => new LOGIC_GATES())
}