package com.notepad.notes.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.notepad.notes.core.constant.DatabaseConst
import com.notepad.notes.data.local.dao.NoteDao
import com.notepad.notes.domain.model.Note

@Database(
    entities = [Note::class],
    version = DatabaseConst.NOTES_DATABASE_VERSION,
    exportSchema = false
)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}