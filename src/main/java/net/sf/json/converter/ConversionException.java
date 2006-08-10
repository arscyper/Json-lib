/*
 * Copyright 2002-2006 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.sf.json.converter;

/**
 * @author Andres Almiray <aalmiray@users.sourceforge.net>
 */
public class ConversionException extends RuntimeException
{
   private static final long serialVersionUID = 1424258244795829747L;

   public ConversionException()
   {
      super();
   }

   public ConversionException( String msg )
   {
      super( msg, null );
   }

   public ConversionException( String msg, Throwable cause )
   {
      super( msg, cause );
   }

   public ConversionException( Throwable cause )
   {
      super( (cause == null ? null : cause.toString()), cause );
   }
}