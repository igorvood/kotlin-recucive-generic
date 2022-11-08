package ru.vood.mutableUnMutable

interface IImmutable<SELF : IImmutable<SELF, TMUTABLE>, TMUTABLE : IMutable<TMUTABLE, SELF>> {

    fun toMutable(): TMUTABLE
}