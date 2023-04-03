//
// Accounts
// Metaplex
//
// This code was generated locally by Funkatronics on 2023-04-03
//
@file:UseSerializers(PublicKeyAs32ByteSerializer::class)

package com.gum.gplsession

import com.metaplex.lib.serialization.serializers.solana.PublicKeyAs32ByteSerializer
import com.solana.core.PublicKey
import kotlin.Long
import kotlinx.serialization.Serializable
import kotlinx.serialization.UseSerializers

@Serializable
class SessionToken(
    val authority: PublicKey,
    val targetProgram: PublicKey,
    val sessionSigner: PublicKey,
    val validUntil: Long
)
