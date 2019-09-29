@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

import java.lang.Math.pow
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.sqrt

/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    var a = 0
    var b: Int = n
    if (n == 0) return 1
    while (b != 0) {
        b /= 10
        a += 1
    }
    return a

}


/**
 * Простая
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
fun fib(n: Int): Int {
    var a: Int = 1
    var b: Int = 1
    var c: Int = 2
    if (n == 1) return 1
    if (n == 2) return 1
    for (i: Int in 3..n) {
        c = a + b
        a = b
        b = c

    }
    return c

}

/**
 * Простая
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int {
    val h: Int = m * n
    var m1 = m
    var n1 = n
    if (m == n) return n
    while (n1 != m1) {
        if (m1 > n1) {
            m1 = m1 - n1
        } else {
            n1 = n1 - m1
        }

    }
    return h / m1


}

/**
 * Простая
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int {
    val a: Int = n
    for (i in 2..a) if (a % i == 0) {
        return i
    }
    return 0
}

/**
 * Простая
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int {
    val a: Int = n
    for (i in 2..a) if (a % i == 0) {
        return a / i
    }
    return 0
}

/**
 * Простая
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
fun isCoPrime(m: Int, n: Int): Boolean {
    var a = m
    var b = n
    if (a == 1 && b == 1) return true
    if (a == b) return false
    while (a != b) {
        if (a > b) {
            a = a - b
        } else {
            b = b - a
        }
    }
    return a == 1

}


/**
 * Простая
 *
 * Для заданных чисел m и n, m <= n, определить, имеется ли хотя бы один точный квадрат между m и n,
 * то есть, существует ли такое целое k, что m <= k*k <= n.
 * Например, для интервала 21..28 21 <= 5*5 <= 28, а для интервала 51..61 квадрата не существует.
 */
fun squareBetweenExists(m: Int, n: Int): Boolean {
    for (i: Int in m..n) {
        val k: Int = sqrt(i.toDouble()).toInt()
        if (k * k == i) return true
    }
    return false
}

/**
 * Средняя
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int {
    var n: Int = 0
    var x1 = x
    while (x1 != 1) {
        if (x1 % 2 == 0) {
            n = n + 1
            x1 = x1 / 2
        } else {
            n = n + 1
            x1 = 3 * x1 + 1
        }
    }
    return n
}

/**
 * Средняя
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double {
    val x1: Double = ((x / PI) % 2) * PI
    var sinx: Double = 0.0
    var a: Double = 1.0
    fun giaithua(n: Int): Double {
        var gt: Double = 1.0
        for (i: Int in 1..n) {
            gt = gt * i
        }
        return gt


    }

    var n: Int = 1
    while (abs(a) >= eps) {
        a = pow(-1.0, (n - 1).toDouble()) * pow(x1, (2 * n - 1).toDouble()) / giaithua(2 * n - 1)
        sinx = sinx + a
        n = n + 1

    }
    return sinx

}

/**
 * Средняя
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double {
    val x1: Double = ((x / PI) % 2) * PI
    var a = 1.0
    var cosx: Double = 0.0
    fun giaithua(n: Int): Double {
        var gt: Double = 1.0
        for (i in 1..n) {
            gt = gt * i

        }
        return gt

    }

    var n: Int = 0
    while (abs(a) >= eps) {
        a = pow(-1.0, n.toDouble()) * pow(x1, 2 * n.toDouble()) / giaithua(2 * n)
        cosx = cosx + a
        n = n + 1


    }
    return cosx
}

/**
 * Средняя
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int {
    var x: Int = n
    var s: Int = 0
    var i: Int
    while (x > 0) {
        i = x % 10
        s = s * 10 + i
        x = x / 10
    }
    return s

}

/**
 * Средняя
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean {
    var x: Int = n
    var y: Int = 0
    var i: Int
    while (x > 0) {
        i = x % 10
        y = y * 10 + i
        x = x / 10
    }

    return n == y


}

/**
 * Средняя
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean {
    var x: Int = n
    var a = 0
    var b = 0
    if (x in 0..9) return false
    while (a == b) {
        a = x % 10
        x = x / 10
        if (x == 0) break
        b = x % 10

    }
    return a != b


}

/**
 * Сложная
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun squareSequenceDigit(n: Int): Int {
    fun count(x: Int): Int {
        var a: Int = x
        var i: Int = 0
        while (a > 0) {
            a = a / 10
            i = i + 1
        }
        return i

    }

    var b = 0
    var k = 0
    while (k < n) {
        k++
        b = b + count(k * k)
        var i: Int = 0
        var c: Int = k * k
        if (b >= n) {
            while (b >= n) {
                i = c % 10
                c = c / 10
                b = b - 1
            }
        return i
            break
        }
    }
    return 0
}

/**
 * Сложная
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int {
    fun fib(n: Int): Int {
        var a = 1
        var b = 1
        var c = 2
        if (n == 1) return 1
        if (n == 2) return 2
        for (i: Int in 3..n) {
            c = a + b
            a = b
            b = c
        }
        return c
    }

    fun count(n: Int): Int {
        var a: Int = n
        var i: Int = 0
        while (a > 0) {
            a = a / 10
            i = i + 1
        }
        return i
    }

    fun countofsequence(n: Int): Int {
        var s = 0
        for (i: Int in 1..n) {
            s = s + count(fib(i))
        }
        return s

    }

    fun cc(n: Int): Int {
        val a: Int = n
        var k: Int = 0
        while (countofsequence(k) < a) {
            k = k + 1
            if (countofsequence(k) >= a) break
        }
        var i: Int = 0
        var b: Int = countofsequence(k)
        var c: Int = fib(k)
        if (a == 1) return 1
        if (a == 2) return 1
        while (b >= a) {
            i = c % 10
            c = c / 10
            b = b - 1

        }
        return i

    }
    return cc(n)
}



