
// Función que resuelve la fórmula dada por NewtonRaphson
def calc(x : Double, const : Double) : Double = x - ((Math.pow(x,2) - const) / (2*x))

// Función que nos ayuda al control del número de iteraciones a realizar
def nAprox(x : Double, ite : Int, const : Int): Double = {
  val result = calc(x, const)
  if(ite == 1){
    result
  } else {
    nAprox(result,ite-1,const)
  }
}

def newtonRaphson(const : Int): Double = {
  var n = const
  if (const < 0) {             // Control de que el número no sea negativo
    n = const * (-1)
  }
  val i = 5                    // Se establece el número de iteraciones a realizar
  val x1 = n/2                 // Se establece el valor para X1
   if (const == 1) {           // Control de la raiz de 1
    1
  } else if (const == 0) {     // Control de la raiz de 0
    0
  } else {
    nAprox(x1,i-1, n)          // Control de la raiz de un número cualquiera
  }
}

newtonRaphson(1)
newtonRaphson(0)
newtonRaphson(10)
newtonRaphson(-10)


