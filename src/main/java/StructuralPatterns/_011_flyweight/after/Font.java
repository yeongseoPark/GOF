package StructuralPatterns._011_flyweight.after;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public final class Font {
    /* intrinsit한 애들, 변경 불가 */
    final String family;

    final int size;
}
