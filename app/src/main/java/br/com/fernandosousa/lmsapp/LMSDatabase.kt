package br.com.fernandosousa.lmsapp

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

// anotação define a lista de entidades e a versão do banco
@Database(entities = arrayOf(Disciplina::class), version = 1)
abstract class LMSDatabase: RoomDatabase() {
    abstract fun disciplinaDAO(): DisciplinaDAO
}