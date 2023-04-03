//
// Instructions
// Metaplex
//
// This code was generated locally by Funkatronics on 2023-04-03
//
package com.gum.gplsession

import com.metaplex.kborsh.Borsh
import com.metaplex.lib.serialization.serializers.solana.AnchorInstructionSerializer
import com.solana.core.AccountMeta
import com.solana.core.PublicKey
import com.solana.core.TransactionInstruction
import kotlin.Boolean
import kotlin.Long
import kotlinx.serialization.Serializable

object GPLSessionInstructions {
    fun createSession(
        sessionToken: PublicKey,
        sessionSigner: PublicKey,
        authority: PublicKey,
        targetProgram: PublicKey,
        systemProgram: PublicKey,
        topUp: Boolean?,
        validUntil: Long?
    ): TransactionInstruction {
        val keys = mutableListOf<AccountMeta>()
        keys.add(AccountMeta(sessionToken, false, true))
        keys.add(AccountMeta(sessionSigner, true, true))
        keys.add(AccountMeta(authority, true, true))
        keys.add(AccountMeta(targetProgram, false, false))
        keys.add(AccountMeta(systemProgram, false, false))
        return TransactionInstruction(PublicKey("null"), keys,
                Borsh.encodeToByteArray(AnchorInstructionSerializer("create_session"),
                Args_createSession(topUp, validUntil)))
    }

    fun revokeSession(
        sessionToken: PublicKey,
        authority: PublicKey,
        systemProgram: PublicKey
    ): TransactionInstruction {
        val keys = mutableListOf<AccountMeta>()
        keys.add(AccountMeta(sessionToken, false, true))
        keys.add(AccountMeta(authority, false, true))
        keys.add(AccountMeta(systemProgram, false, false))
        return TransactionInstruction(PublicKey("null"), keys,
                Borsh.encodeToByteArray(AnchorInstructionSerializer("revoke_session"),
                Args_revokeSession()))
    }

    @Serializable
    class Args_createSession(val topUp: Boolean?, val validUntil: Long?)

    @Serializable
    class Args_revokeSession()
}
