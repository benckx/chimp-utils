package be.encelade.chimp.gameplay

enum class Palette {

    /**
     * https://www.color-hex.com/color-palette/94808
     */
    MERCENARY_TERRITORY,

    /**
     * https://www.color-hex.com/color-palette/94691
     */
    FROSTY_CANDY_FLOSS,

    /**
     * https://www.color-hex.com/color-palette/39743
     */
    MOSAIC_TILES,

    /**
     * https://www.color-hex.com/color-palette/16376
     */
    GENTILE_DA_FABRIANO,

    /**
     * Generated
     */
    CARIBBEAN,

    /**
     * https://colorswall.com/palette/24609/
     */
    TINTS_OF_LIGHT_SLATE_GREY;

    fun listColors(): List<Color> {
        return when (this) {
            MERCENARY_TERRITORY -> {
                listOf(
                        Color("#00ffff"),
                        Color("#a020f0"),
                        Color("#ff4500"),
                        Color("#0000ff"),
                        Color("#ffa500")
                )
            }
            FROSTY_CANDY_FLOSS -> {
                listOf(
                        Color("#feff58"),
                        Color("#ffaa28"),
                        Color("#ff195f"),
                        Color("#b04ddd"),
                        Color("#50e9ff")
                )
            }
            MOSAIC_TILES -> {
                listOf(
                        Color("#ffb5a6"),
                        Color("#ff7f7f"),
                        Color("#b6b6c0"),
                        Color("#6673a1"),
                        Color("#535457")
                )
            }
            GENTILE_DA_FABRIANO -> {
                listOf(
                        Color("#1d1125"),
                        Color("#92363a"),
                        Color("#a5646a"),
                        Color("#dddddf"),
                        Color("#c9c4c2")
                )
            }
            CARIBBEAN -> {
                listOf(
                        Color("#F8FFE5"),
                        Color("#06D6A0"),
                        Color("#1B9AAA"),
                        Color("#EF476F"),
                        Color("#FFC43D")
                )
            }
            TINTS_OF_LIGHT_SLATE_GREY -> {
                listOf(
                        Color("#778899"),
                        Color("#8594a3"),
                        Color("#92a0ad"),
                        Color("#a0acb8"),
                        Color("#adb8c2"),
                        Color("#bbc4cc"),
                        Color("#c9cfd6"),
                        Color("#d6dbe0"),
                        Color("#e4e7eb"),
                        Color("#f1f3f5")
                )
            }
        }
    }
}
