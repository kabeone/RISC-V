import chisel3._

class LOGIC_GATES extends Module {
  val io = IO(new Bundle {
    val switch_a = Input(Bool())
    val switch_b = Input(Bool())
    val not = Output(Bool())
    val and = Output(Bool())
    val or = Output(Bool())
    val xor = Output(Bool())
    val nand = Output(Bool())
    val nor = Output(Bool())
    val nxor = Output(Bool())
  })

  io.not := ~io.switch_a
  io.and := io.switch_a & io.switch_a
  io.or := io.switch_a | io.switch_a
  io.xor := io.switch_a ^ io.switch_a
  io.nand := ~(io.switch_a & io.switch_b)
  io.nor := ~(io.switch_a | io.switch_a)
  io.nxor := ~(io.switch_a ^ io.switch_a)
}

object LOGIC_GATES extends App {
  chisel3.Driver.execute(args, () => new LOGIC_GATES())
}