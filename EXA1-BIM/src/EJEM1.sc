
def f(x:Double, n:Int): Double = Math.pow(x,2) - n


def dx(x: Double): Double = 2 * x

def operacion( n : Int) : Double = {
  var x = 1.0
  (1 to 25).foreach(i => x = x - f(x, n) / dx(x))
  x
}

def raiz_cuadrada(n: Int) : Double = {
  if(n > 0) operacion(n) else 0
}

raiz_cuadrada(25)