package data
import model.ZodiacSigns
import com.example.recyclerviewzodiacproject.R
class DataSource {
    fun loadAffirmations(): List<ZodiacSigns> {
        return listOf<ZodiacSigns>(
            ZodiacSigns(R.string.aries),
            ZodiacSigns(R.string.taurus),
            ZodiacSigns(R.string.gemini),
            ZodiacSigns(R.string.cancer),
            ZodiacSigns(R.string.leo),
            ZodiacSigns(R.string.virgo),
            ZodiacSigns(R.string.libra),
            ZodiacSigns(R.string.scorpio),
            ZodiacSigns(R.string.sagittarius),
            ZodiacSigns(R.string.capricorn),
            ZodiacSigns(R.string.aquarius),
            ZodiacSigns(R.string.pisces)
        )
    }
}