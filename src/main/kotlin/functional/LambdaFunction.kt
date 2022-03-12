package functional

val upperCase1: (String) -> String = { str: String -> str.uppercase() }
val upperCase2: (String) -> String = { str -> str.uppercase() }
val upperCase3 = { str: String -> str.uppercase() }
val upperCase5: (String) -> String = { it.uppercase() }
val upperCase6: (String) -> String = String::uppercase