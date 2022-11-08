package ru.vood.mutableUnMutable

interface IMutable<SELF : IMutable<SELF, TIMUTABLE>, TIMUTABLE : IImmutable<TIMUTABLE, SELF>> {

    fun toImmutable(): TIMUTABLE
}