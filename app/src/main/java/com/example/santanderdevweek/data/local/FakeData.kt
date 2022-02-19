package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("carlos")
        val cartao = Cartao ("123456789")
        return Conta("123456-7","1234-5","1234,12","2345,23",cliente,cartao);
    }

}
