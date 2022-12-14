package com.example.medscompanion.medicineData

class MedsData(
    val type: String,
    val name: String,
    val company: String,
    val strength: String,
    val price: String
) {
    val availableBrands =
        "Square Pharmaceuticals, UniMed UniHealth Pharmaceuticals Limited, Reckitt, The ACME Laboratories Ltd"
    val aspirinPhermalogy =
        "By decreasing platelet aggregation, Aspirin inhibits thrombus formation on the arterial side of the circulation, where thrombi are formed by platelet aggregation and anticoagulants have little effect. Aspirin is the analgesic of choice for headache, transient musculoskeletal pain and dysmenorrhoea. It has anti-inflammatory and antipyretic properties, which may be useful. Enteric-coated Aspirin reduces intestinal disturbance and gastrointestinal ulceration due to aspirin."
    val aspririnSide =
        "Side effects for the usual dosage of Aspirin are mild including nausea, dyspepsia, gastrointestinal ulceration and bronchospasm etc."
}

val squareMed = MedsData("Aspirin", "Carva", "Square Pharma", "75mg", "160")
val acmeMed = MedsData("Aspirin", "Ecosprin", "Acme Pharma", "75mg", "")
val unihealthMed = MedsData("Aspirin", "Erasprin", "UniHealth UniMed", "75mg", "")
val reckitMed = MedsData("Aspirin", "Dispirin", "Reckit Benkiser", "300mg", "")