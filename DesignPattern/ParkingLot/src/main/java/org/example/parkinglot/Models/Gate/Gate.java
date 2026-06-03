package org.example.parkinglot.Models.Gate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.example.parkinglot.enums.GateType;

@RequiredArgsConstructor
public abstract class Gate {
    protected final String gateId;
    public abstract GateType getType();
}
