    package com.example.cinema.model.enums;

    import lombok.Getter;

    @Getter
    public enum UserRank {
        NORMAL(0.03),
        VIP(0.05),
        PREMIUM(0.10);

        private final double accumulationRate;

        UserRank(double accumulationRate) {
            this.accumulationRate = accumulationRate;
        }

    }
