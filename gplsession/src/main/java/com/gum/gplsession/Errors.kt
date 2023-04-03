//
// Errors
// Metaplex
//
// This code was generated locally by Funkatronics on 2023-04-03
//
package com.gum.gplsession

import kotlin.Int
import kotlin.String

sealed interface GPLSessionError {
    val code: Int

    val message: String
}

class ValidityTooLong : GPLSessionError {
    override val code: Int = 6000

    override val message: String = "Requested validity is too long"
}
