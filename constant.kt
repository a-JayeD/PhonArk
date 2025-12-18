package com.phonecontroller.core

/**
 * Central configuration for the Phone Controller app.
 * All magic numbers and settings are defined here.
 * 
 * SECURITY NOTE: These values are carefully chosen.
 * Do not modify without understanding the security implications.
 */
object Constants {

    // ═══════════════════════════════════════════════════════════════
    // NETWORK CONFIGURATION
    // ═══════════════════════════════════════════════════════════════
    
    /**
     * Port the phone listens on for PC connections.
     * Using a high port to avoid conflicts and root requirements.
     */
    const val SERVER_PORT: Int = 52734
    
    /**
     * Service type for mDNS/DNS-SD discovery.
     * PCs will search for this service type on the local network.
     */
    const val SERVICE_TYPE: String = "_phonecontroller._tcp."
    
    /**
     * Timeout for network read operations in milliseconds.
     */
    const val SOCKET_READ_TIMEOUT_MS: Int = 30_000  // 30 seconds
    
    /**
     * Timeout for network connect operations in milliseconds.
     */
    const val SOCKET_CONNECT_TIMEOUT_MS: Int = 10_000  // 10 seconds
    
    /**
     * Maximum message size in bytes.
     * Prevents memory exhaustion attacks.
     */
    const val MAX_MESSAGE_SIZE_BYTES: Int = 1_048_576  // 1 MB

    // ═══════════════════════════════════════════════════════════════
    // PAIRING CONFIGURATION
    // ═══════════════════════════════════════════════════════════════
    
    /**
     * Number of digits in the pairing code.
     */
    const val PAIRING_CODE_LENGTH: Int = 6
    
    /**
     * How long a pairing code remains valid in milliseconds.
     * After this time, the code expires and pairing must restart.
     */
    const val PAIRING_CODE_EXPIRY_MS: Long = 60_000  // 60 seconds
    
    /**
     * Maximum number of incorrect code attempts before lockout.
     */
    const val MAX_PAIRING_ATTEMPTS: Int = 3
    
    /**
     * Lockout duration after max failed attempts in milliseconds.
     */
    const val PAIRING_LOCKOUT_DURATION_MS: Long = 300_000  // 5 minutes

    // ═══════════════════════════════════════════════════════════════
    // SESSION CONFIGURATION
    // ═══════════════════════════════════════════════════════════════
    
    /**
     * Default session duration in milliseconds.
     * After this time, the PC must re-pair.
     */
    const val DEFAULT_SESSION_DURATION_MS: Long = 86_400_000  // 24 hours
    
    /**
     * Maximum allowed sessions at the same time.
     * Prevents resource exhaustion.
     */
    const val MAX_CONCURRENT_SESSIONS: Int = 5

    // ═══════════════════════════════════════════════════════════════
    // ENCRYPTION CONFIGURATION
    // ═══════════════════════════════════════════════════════════════
    
    /**
     * Encryption algorithm for message encryption.
     */
    const val ENCRYPTION_ALGORITHM: String = "AES/GCM/NoPadding"
    
    /**
     * Key size for AES encryption in bits.
     */
    const val AES_KEY_SIZE_BITS: Int = 256
    
    /**
     * GCM authentication tag length in bits.
     */
    const val GCM_TAG_LENGTH_BITS: Int = 128
    
    /**
     * GCM IV/nonce length in bytes.
     */
    const val GCM_IV_LENGTH_BYTES: Int = 12
    
    /**
     * Key exchange algorithm.
     */
    const val KEY_EXCHANGE_ALGORITHM: String = "ECDH"
    
    /**
     * Elliptic curve for key exchange.
     */
    const val EC_CURVE_NAME: String = "secp256r1"
    
    /**
     * Key derivation function algorithm.
     */
    const val KDF_ALGORITHM: String = "HmacSHA256"
    
    /**
     * Number of KDF iterations.
     */
    const val KDF_ITERATIONS: Int = 10_000

    // ═══════════════════════════════════════════════════════════════
    // COMMAND CONFIGURATION
    // ═══════════════════════════════════════════════════════════════
    
    /**
     * Maximum age of a command in milliseconds.
     * Commands older than this are rejected (prevents replay attacks).
     */
    const val COMMAND_MAX_AGE_MS: Long = 30_000  // 30 seconds
    
    /**
     * Maximum clock skew allowed between PC and phone in milliseconds.
     */
    const val MAX_CLOCK_SKEW_MS: Long = 60_000  // 60 seconds

    // ═══════════════════════════════════════════════════════════════
    // SERVICE CONFIGURATION
    // ═══════════════════════════════════════════════════════════════
    
    /**
     * Notification channel ID for the foreground service.
     */
    const val NOTIFICATION_CHANNEL_ID: String = "phone_controller_service"
    
    /**
     * Notification ID for the foreground service.
     */
    const val FOREGROUND_SERVICE_NOTIFICATION_ID: Int = 1001
}