/*
 * Léon - The URL Cleaner
 * Copyright (C) 2023 Sven Jacobs
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.svenjacobs.app.leon.core.domain.sanitizer.jdoqocy

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class JdoqocySanitizerTest :
	WordSpec(
		{

			"invoke" should {

				"extract URL from Jdoqocy redirect link" {
					val sanitizer = JdoqocySanitizer()
					val result = sanitizer(
						"https://www.jdoqocy.com/click-7988170-15232592?SID=11003b6m4t07&" +
							"url=https%3A%2F%2Fwww.gog.com%2Fde%2Fgame%2Falwas_awakening",
					)

					result shouldBe "https://www.gog.com/de/game/alwas_awakening"
				}
			}
		},
	)
